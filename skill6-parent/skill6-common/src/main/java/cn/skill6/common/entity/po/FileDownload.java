package cn.skill6.common.entity.po;

import java.util.Date;

import cn.skill6.common.entity.enums.FileType;

/**
 * 文件下载实体类
 *
 * @author 何明胜
 * @version 1.0.2
 * @since 2018年8月15日 下午11:33:07
 */
public class FileDownload {
  private Long fileId;

  private String fileName;

  private String fileUrl;

  private Date fileUploadDate;

  private Integer fileDownloadCount;

  private String fileHashCode;

  private FileType fileType;

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */ @Override
  public String toString() {
    return "FileDownload [fileId="
        + fileId
        + ", fileName="
        + fileName
        + ", fileUrl="
        + fileUrl
        + ", fileUploadDate="
        + fileUploadDate
        + ", fileDownloadCount="
        + fileDownloadCount
        + ", fileHashCode="
        + fileHashCode
        + ", fileType="
        + fileType
        + "]";
  }

  public FileDownload(
      Long fileId,
      String fileName,
      String fileUrl,
      Date fileUploadDate,
      Integer fileDownloadCount,
      String fileHashCode) {
    this.fileId = fileId;
    this.fileName = fileName;
    this.fileUrl = fileUrl;
    this.fileUploadDate = fileUploadDate;
    this.fileDownloadCount = fileDownloadCount;
    this.fileHashCode = fileHashCode;
  }

  public FileDownload() {
    super();
  }

  public Long getFileId() {
    return fileId;
  }

  public void setFileId(Long fileId) {
    this.fileId = fileId;
  }

  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName == null ? null : fileName.trim();
  }

  public String getFileUrl() {
    return fileUrl;
  }

  public void setFileUrl(String fileUrl) {
    this.fileUrl = fileUrl == null ? null : fileUrl.trim();
  }

  public Date getFileUploadDate() {
    return fileUploadDate;
  }

  public void setFileUploadDate(Date fileUploadDate) {
    this.fileUploadDate = fileUploadDate;
  }

  public Integer getFileDownloadCount() {
    return fileDownloadCount;
  }

  public void setFileDownloadCount(Integer fileDownloadCount) {
    this.fileDownloadCount = fileDownloadCount;
  }

  public String getFileHashCode() {
    return fileHashCode;
  }

  public void setFileHashCode(String fileHashCode) {
    this.fileHashCode = fileHashCode == null ? null : fileHashCode.trim();
  }

  public FileType getFileType() {
    return fileType;
  }

  public void setFileType(FileType fileType) {
    this.fileType = fileType;
  }
}
