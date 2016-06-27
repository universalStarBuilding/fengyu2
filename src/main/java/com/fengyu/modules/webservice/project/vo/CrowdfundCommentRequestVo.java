package com.fengyu.modules.webservice.project.vo;

import com.fengyu.common.page.Pagetables;

import java.util.Date;

public class CrowdfundCommentRequestVo extends Pagetables{
    private Integer id;

    private Integer topicId;

    private String topicType;

    private String content;

    private Integer fromUid;

    private Date commentDate;

    private Boolean status;

    private Integer auditId;

    private Byte auditDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getTopicType() {
        return topicType;
    }

    public void setTopicType(String topicType) {
        this.topicType = topicType == null ? null : topicType.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getFromUid() {
        return fromUid;
    }

    public void setFromUid(Integer fromUid) {
        this.fromUid = fromUid;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getAuditId() {
        return auditId;
    }

    public void setAuditId(Integer auditId) {
        this.auditId = auditId;
    }

    public Byte getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Byte auditDate) {
        this.auditDate = auditDate;
    }
}