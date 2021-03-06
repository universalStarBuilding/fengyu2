package com.fengyu.modules.webservice.project.vo;

import com.fengyu.common.page.Pagetables;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;


public class CrowdfundAttentionReponseVo extends Pagetables{
    private String projectImage;
    private String projectName;
    private Date releasesTime;
    private String projectSummary;

    public String getProjectImage() {
        return projectImage;
    }

    public void setProjectImage(String projectImage) {
        this.projectImage = projectImage;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Date getReleasesTime() {
        return releasesTime;
    }

    public void setReleasesTime(Date releasesTime) {
        this.releasesTime = releasesTime;
    }

    public String getProjectSummary() {
        return projectSummary;
    }

    public void setProjectSummary(String projectSummary) {
        this.projectSummary = projectSummary;
    }
}