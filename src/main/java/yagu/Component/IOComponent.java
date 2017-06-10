/**
 * @author xuxc
 * @since 2017年5月26日 下午3:32:16
 */
package yagu.Component;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;

import yagu.utils.UpLoadFilesUtils;

/**
 * @author xuxc
 * @since 2017年5月26日 下午3:32:16
 */
@Component
public class IOComponent {

    @Autowired
    private UpLoadFilesUtils upLoadFilesUtils;
    @Autowired
    private HttpServletRequest request;
    
    /**
     * 上传图片组件
     * 可校验图片格式
     * @author xuxc
     * @since 2017年5月26日 下午3:49:54
     * @param file
     */
    public void upLoadFile(@RequestBody MultipartFile file) {
        
        try {
            upLoadFilesUtils.upLoadPicture(file, request);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
