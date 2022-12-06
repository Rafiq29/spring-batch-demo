package com.herb.springbatchdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "tutorial")
public class Tutorial {

    private int tutorialId;
    private String tutorialAuthor;
    private String tutorialTitle;
    private String submissionDate;
    private String tutorialIcon;
    private String tutorialDescription;

    public int getTutorialId() {
        return tutorialId;
    }

    public void setTutorialId(int tutorialId) {
        this.tutorialId = tutorialId;
    }

    @XmlElement(name = "tutorial_author")
    public String getTutorialAuthor() {
        return tutorialAuthor;
    }

    public void setTutorialAuthor(String tutorialAuthor) {
        this.tutorialAuthor = tutorialAuthor;
    }

    @XmlElement(name = "tutorial_title")
    public String getTutorialTitle() {
        return tutorialTitle;
    }

    public void setTutorialTitle(String tutorialTitle) {
        this.tutorialTitle = tutorialTitle;
    }

    @XmlElement(name = "submission_date")
    public String getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(String submissionDate) {
        this.submissionDate = submissionDate;
    }

    @XmlElement(name = "tutorial_icon")
    public String getTutorialIcon() {
        return tutorialIcon;
    }

    public void setTutorialIcon(String tutorialIcon) {
        this.tutorialIcon = tutorialIcon;
    }

    @XmlElement(name = "tutorial_description")
    public String getTutorialDescription() {
        return tutorialDescription;
    }

    public void setTutorialDescription(String tutorialDescription) {
        this.tutorialDescription = tutorialDescription;
    }
}
