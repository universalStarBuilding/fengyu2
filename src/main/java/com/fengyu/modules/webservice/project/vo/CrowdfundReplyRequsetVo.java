package com.fengyu.modules.webservice.project.vo;

import com.fengyu.common.persistence.DataEntity;

import java.util.Date;

public class CrowdfundReplyRequsetVo extends DataEntity<CrowdfundReplyRequsetVo>{

    private Integer commentId;      //评论ID

    private Integer replyId;        //回复目标id

    private String replyType;       //回复类型:针对评论的回复,针对回复的回复

    private String content;         //回复内容

    private Integer fromUid;        //	回复用户id

    private Integer toUid;          //目标用户id

    private Date replyDate;         //回复时间

    private Boolean status;         //状态：1 已审核 0 未审核

    private Integer auditId;        //审核人ID

    private Date auditDate;         //审核时间

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public String getReplyType() {
        return replyType;
    }

    public void setReplyType(String replyType) {
        this.replyType = replyType == null ? null : replyType.trim();
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

    public Integer getToUid() {
        return toUid;
    }

    public void setToUid(Integer toUid) {
        this.toUid = toUid;
    }

    public Date getReplyDate() {
        return replyDate;
    }

    public void setReplyDate(Date replyDate) {
        this.replyDate = replyDate;
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

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }
}