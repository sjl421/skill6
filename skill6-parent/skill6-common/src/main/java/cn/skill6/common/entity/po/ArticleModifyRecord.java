package cn.skill6.common.entity.po;

import java.util.Date;

/**
 * 文章历史版本实体类
 *
 * @author 何明胜
 * @version 1.0.0
 * @since 2018年8月28日 上午1:25:48
 */
public class ArticleModifyRecord {
  private Long articleId;

  private Date articleLastModifyDate;

  private String articleTitle;

  private String articleAuthor;

  private String articleSummary;

  private String articleLabel;

  private Integer articleReadTotal;

  private Date articleCreateDate;

  private String articleCategoryId;

  private Boolean artilcePlaceTop;

  private Integer articleTopPriority;

  private Boolean articleAttachFile;

  private String articleHtmlContent;

  private String articleMdContent;

  private String articleAttachUrl;

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */ @Override
  public String toString() {
    return "ArticleModifyRecord [articleId="
        + articleId
        + ", articleLastModifyDate="
        + articleLastModifyDate
        + ", articleTitle="
        + articleTitle
        + ", articleAuthor="
        + articleAuthor
        + ", articleSummary="
        + articleSummary
        + ", articleLabel="
        + articleLabel
        + ", articleReadTotal="
        + articleReadTotal
        + ", articleCreateDate="
        + articleCreateDate
        + ", articleCategoryId="
        + articleCategoryId
        + ", artilcePlaceTop="
        + artilcePlaceTop
        + ", articleTopPriority="
        + articleTopPriority
        + ", articleAttachFile="
        + articleAttachFile
        + ", articleHtmlContent="
        + articleHtmlContent
        + ", articleMdContent="
        + articleMdContent
        + ", articleAttachUrl="
        + articleAttachUrl
        + "]";
  }

  public ArticleModifyRecord(
      Long articleId,
      Date articleLastModifyDate,
      String articleTitle,
      String articleAuthor,
      String articleSummary,
      String articleLabel,
      Integer articleReadTotal,
      Date articleCreateDate,
      String articleCategoryId,
      Boolean artilcePlaceTop,
      Integer articleTopPriority,
      Boolean articleAttachFile,
      String articleHtmlContent,
      String articleMdContent,
      String articleAttachUrl) {
    this.articleId = articleId;
    this.articleLastModifyDate = articleLastModifyDate;
    this.articleTitle = articleTitle;
    this.articleAuthor = articleAuthor;
    this.articleSummary = articleSummary;
    this.articleLabel = articleLabel;
    this.articleReadTotal = articleReadTotal;
    this.articleCreateDate = articleCreateDate;
    this.articleCategoryId = articleCategoryId;
    this.artilcePlaceTop = artilcePlaceTop;
    this.articleTopPriority = articleTopPriority;
    this.articleAttachFile = articleAttachFile;
    this.articleHtmlContent = articleHtmlContent;
    this.articleMdContent = articleMdContent;
    this.articleAttachUrl = articleAttachUrl;
  }

  public ArticleModifyRecord() {
    super();
  }

  public Long getArticleId() {
    return articleId;
  }

  public void setArticleId(Long articleId) {
    this.articleId = articleId;
  }

  public Date getArticleLastModifyDate() {
    return articleLastModifyDate;
  }

  public void setArticleLastModifyDate(Date articleLastModifyDate) {
    this.articleLastModifyDate = articleLastModifyDate;
  }

  public String getArticleTitle() {
    return articleTitle;
  }

  public void setArticleTitle(String articleTitle) {
    this.articleTitle = articleTitle == null ? null : articleTitle.trim();
  }

  public String getArticleAuthor() {
    return articleAuthor;
  }

  public void setArticleAuthor(String articleAuthor) {
    this.articleAuthor = articleAuthor == null ? null : articleAuthor.trim();
  }

  public String getArticleSummary() {
    return articleSummary;
  }

  public void setArticleSummary(String articleSummary) {
    this.articleSummary = articleSummary == null ? null : articleSummary.trim();
  }

  public String getArticleLabel() {
    return articleLabel;
  }

  public void setArticleLabel(String articleLabel) {
    this.articleLabel = articleLabel == null ? null : articleLabel.trim();
  }

  public Integer getArticleReadTotal() {
    return articleReadTotal;
  }

  public void setArticleReadTotal(Integer articleReadTotal) {
    this.articleReadTotal = articleReadTotal;
  }

  public Date getArticleCreateDate() {
    return articleCreateDate;
  }

  public void setArticleCreateDate(Date articleCreateDate) {
    this.articleCreateDate = articleCreateDate;
  }

  public String getArticleCategoryId() {
    return articleCategoryId;
  }

  public void setArticleCategoryId(String articleCategoryId) {
    this.articleCategoryId = articleCategoryId == null ? null : articleCategoryId.trim();
  }

  public Boolean getArtilcePlaceTop() {
    return artilcePlaceTop;
  }

  public void setArtilcePlaceTop(Boolean artilcePlaceTop) {
    this.artilcePlaceTop = artilcePlaceTop;
  }

  public Integer getArticleTopPriority() {
    return articleTopPriority;
  }

  public void setArticleTopPriority(Integer articleTopPriority) {
    this.articleTopPriority = articleTopPriority;
  }

  public Boolean getArticleAttachFile() {
    return articleAttachFile;
  }

  public void setArticleAttachFile(Boolean articleAttachFile) {
    this.articleAttachFile = articleAttachFile;
  }

  public String getArticleHtmlContent() {
    return articleHtmlContent;
  }

  public void setArticleHtmlContent(String articleHtmlContent) {
    this.articleHtmlContent = articleHtmlContent == null ? null : articleHtmlContent.trim();
  }

  public String getArticleMdContent() {
    return articleMdContent;
  }

  public void setArticleMdContent(String articleMdContent) {
    this.articleMdContent = articleMdContent == null ? null : articleMdContent.trim();
  }

  public String getArticleAttachUrl() {
    return articleAttachUrl;
  }

  public void setArticleAttachUrl(String articleAttachUrl) {
    this.articleAttachUrl = articleAttachUrl == null ? null : articleAttachUrl.trim();
  }
}
