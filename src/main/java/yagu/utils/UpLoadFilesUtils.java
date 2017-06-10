package yagu.utils;

//import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
//import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.Iterator;
//import java.util.List;

//import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
//import org.apache.tomcat.util.http.fileupload.FileItem;
//import org.apache.tomcat.util.http.fileupload.FileItemFactory;
//import org.apache.tomcat.util.http.fileupload.FileItemIterator;
//import org.apache.tomcat.util.http.fileupload.FileItemStream;
//import org.apache.tomcat.util.http.fileupload.FileUploadBase.FileItemIteratorImpl;
//import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
//import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.springframework.web.multipart.MultipartFile;

//import com.yaguoa.common.exception.ApplicationException;

/**目的：完成文件上传，资源收录。返回文件地址
 *
 * @author xuxc
 *
 */
@Component
public class UpLoadFilesUtils {

/*
   private File uploadPath;


   private File tempPath;



//   public void init() throws ServletException {
//
//       //在系统启动的时候，就开始初始化，在初始化时，检查上传图片的文件夹和存放临时文件的文件夹是否存在，如果不存在，就创建
//
//       //获取根目录对应的真实物理路径
//       uploadPath = new File(request.getSession().getServletContext().getRealPath("/"));
//
//       //如果目录不存在
//       if (!uploadPath.exists()) {
//           //创建目录
//           uploadPath.mkdir();
//       }
//
//       //临时目录
//       //File tempFile = new File(item.getName())构造临时对象
//       tempPath = new File(request.getSession().getServletContext().getRealPath("temp"));
//       if (!tempPath.exists()) {
//           tempPath.mkdir();
//       }
//
//       //如果不显示调用父类方法，就不会有itemManager实例，因此会造成空指针
////       super.init();
//
//
//
//   }

   public void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {

       //从item_upload.jsp中拿取数据，因为上传页的编码格式跟一般的不同，使用的是enctype="multipart/form-data"
       //form提交采用multipart/form-data,无法采用req.getParameter()取得数据
       //String itemNo = req.getParameter("itemNo");
       //System.out.println("itemNo======" + itemNo);


   *//********************************使用 FileUpload 组件解析表单********************//*

       //DiskFileItemFactory：创建 FileItem 对象的工厂，在这个工厂类中可以配置内存缓冲区大小和存放临时文件的目录。
       DiskFileItemFactory factory = new DiskFileItemFactory();
       // maximum size that will be stored in memory
       factory.setSizeThreshold(4096);
       // the location for saving data that is larger than getSizeThreshold()
       factory.setRepository(tempPath);



       //ServletFileUpload：负责处理上传的文件数据，并将每部分的数据封装成一到 FileItem 对象中。
       //在接收上传文件数据时，会将内容保存到内存缓存区中，如果文件内容超过了 DiskFileItemFactory 指定的缓冲区的大小，
       //那么文件将被保存到磁盘上，存储为 DiskFileItemFactory 指定目录中的临时文件。
       //等文件数据都接收完毕后，ServletUpload再从文件中将数据写入到上传文件目录下的文件中


       ServletFileUpload upload = new ServletFileUpload(factory);
       // maximum size before a FileUploadException will be thrown
       upload.setSizeMax(1000000 * 20);


       *//*******************************解析表单传递过来的数据，返回List集合数据-类型:FileItem***********//*

       try {

           List fileItems = upload.parseRequest(request);
           FileItemIterator iter2 = upload.getItemIterator(request);
           iter2.hasNext();


           String itemNo = "";
           //Iterator iter = fileItems.iterator()取其迭代器
           //iter.hasNext()检查序列中是否还有元素
           for (Iterator iter = fileItems.iterator(); iter.hasNext();) {
               //获得序列中的下一个元素
               FileItem item = (FileItem) iter.next();


               //判断是文件还是文本信息
               //是普通的表单输入域
               if(item.isFormField()) {
                   if ("itemNo".equals(item.getFieldName())) {
                       itemNo = item.getString();
                   }
               }
               //是否为input="type"输入域
               if (!item.isFormField()) {
                   //上传文件的名称和完整路径
                   String fileName = item.getName();

                   long size = item.getSize();
                   //判断是否选择了文件
                   if ((fileName == null || fileName.equals("")) && size == 0) {
                       continue;
                   }
                   //截取字符串 如：C:\WINDOWS\Debug\PASSWD.LOG
                   fileName = fileName.substring(fileName.lastIndexOf("\\") + 1, fileName.length());

                    // 保存文件在服务器的物理磁盘中：第一个参数是：完整路径（不包括文件名）第二个参数是：文件名称
                   //item.write(file);
                   //修改文件名和物料名一致，且强行修改了文件扩展名为gif
                   //item.write(new File(uploadPath, itemNo + ".gif"));
                   //将文件保存到目录下，不修改文件名
                   item.write(new File(uploadPath, fileName));



                   //将图片文件名写入打数据库
                   itemManager.uploadItemImage(itemNo, fileName);

               }
           }
           response.sendRedirect(request.getContextPath() + "/servlet/item/SearchItemServlet");
       } catch (Exception e) {
           e.printStackTrace();
           throw new ApplicationException("上传失败！");
       }


   }*/
   
    /**
     * 上传文件方法
     * @author xuxc
     * @since 2017年5月26日 下午3:51:01
     * @param wb
     * @param req
     * @return
     * @throws IOException
     */
   public String upLoadPicture(MultipartFile wb,HttpServletRequest req) throws IOException{
	   String name = wb.getOriginalFilename();
	   String picturetype = IsPicture(name);
	   String url = null;
	   if(StringUtils.isNotBlank(picturetype)){
		   url=this.picture(wb,picturetype,req);
	   }
	   return url;
   }

   /**
    * 验证文件是否为图片
    * @author xuxc
    * @since 2017年5月26日 下午3:51:10
    * @param filename
    * @return
    */
   private String IsPicture(String filename) {
	    String result = null;
	    //如果filename可用，并且不为空字符串
	    if (filename != null && !"".equals(filename)) {
	        //当前文件扩展名
	        String ext = filename.substring(filename.lastIndexOf(".") + 1);
	        //图片的各种扩展名数组
	        String[] files = {"bmp","jpg","png","tiff","gif","pcx","tga",
	        		"exif","fpx","svg","psd","cdr","pcd","dxf","ufo","eps","ai","raw"};
	        //如果此扩展名属于图片扩展名则修改标记为true
	        for (int i = 0; i < files.length; i++) {
	            if (ext.equals(files[i])) {
	            	result = ext;
	                break;
	            }
	        }
	    }
	    return result;
	}


   /**
    * 将文件格式存入本机，返回本机地址
    * @author xuxc
    * @since 2017年5月26日 下午3:51:18
    * @param wb
    * @param picturetype
    * @param req
    * @return
    * @throws IOException
    */
   private String picture(MultipartFile wb,String picturetype,HttpServletRequest req) throws IOException {
		Date date = new Date();
		HttpSession session =req.getSession();
		String realPath = session.getServletContext().getRealPath("/");
		String files = "upLoad/img/" + new SimpleDateFormat("yyyy-MM-dd").format(date);
		String path1 = realPath + files;
		File newFile = new File(path1);
		if (!newFile.exists()) {
			newFile.mkdirs();
		}
		realPath = realPath +files + "/" + date.getTime() + "." + picturetype;
		File file = new File(realPath);
		realPath = realPath.replaceAll("\\\\", "/");
		wb.transferTo(file);

		return realPath;
	}
}
