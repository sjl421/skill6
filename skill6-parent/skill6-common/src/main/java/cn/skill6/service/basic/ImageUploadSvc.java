package cn.skill6.service.basic;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileUploadException;

import cn.skill6.common.entity.vo.ResponseJson;

/**
 * 图片存储接口
 *
 * @author 何明胜
 * @version 1.0.0
 * @since 2018年9月13日 上午12:46:40
 */
public interface ImageUploadSvc {

  /**
   * 上传图片
   *
   * @param request
   * @return
   * @throws FileUploadException
   * @throws IOException
   */
  public ResponseJson uploadImage(HttpServletRequest request)
      throws IOException, FileUploadException;

  /**
   * 下载图片
   *
   * @param imageId
   * @param response
   * @throws IOException
   */
  public void downloadImageById(Long imageId, HttpServletResponse response) throws IOException;
}
