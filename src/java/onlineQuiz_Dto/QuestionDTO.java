
package onlineQuiz_Dto;

import java.util.Objects;

public class QuestionDTO {

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final QuestionDTO other = (QuestionDTO) obj;
        if (!Objects.equals(this.subid, other.subid)) {
            return false;
        }
        if (!Objects.equals(this.subject, other.subject)) {
            return false;
        }
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        if (!Objects.equals(this.ans1, other.ans1)) {
            return false;
        }
        if (!Objects.equals(this.ans2, other.ans2)) {
            return false;
        }
        if (!Objects.equals(this.ans3, other.ans3)) {
            return false;
        }
        if (!Objects.equals(this.ans4, other.ans4)) {
            return false;
        }
        return Objects.equals(this.correctsns, other.correctsns);
    }

    public QuestionDTO(String subid, String subject, String question, String ans1, String ans2, String ans3, String ans4, String correctsns) {
        this.subid = subid;
        this.subject = subject;
        this.question = question;
        this.ans1 = ans1;
        this.ans2 = ans2;
        this.ans3 = ans3;
        this.ans4 = ans4;
        this.correctsns = correctsns;
    }

    @Override
    public String toString() {
        return "Question{" + "subid=" + subid + ", subject=" + subject + ", question=" + question + ", ans1=" + ans1 + ", ans2=" + ans2 + ", ans3=" + ans3 + ", ans4=" + ans4 + ", correctsns=" + correctsns + '}';
    }

    public String getSubid() {
        return subid;
    }

    public void setSubid(String subid) {
        this.subid = subid;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAns1() {
        return ans1;
    }

    public void setAns1(String ans1) {
        this.ans1 = ans1;
    }

    public String getAns2() {
        return ans2;
    }

    public void setAns2(String ans2) {
        this.ans2 = ans2;
    }

    public String getAns3() {
        return ans3;
    }

    public void setAns3(String ans3) {
        this.ans3 = ans3;
    }

    public String getAns4() {
        return ans4;
    }

    public void setAns4(String ans4) {
        this.ans4 = ans4;
    }

    public String getCorrectsns() {
        return correctsns;
    }

    public void setCorrectsns(String correctsns) {
        this.correctsns = correctsns;
    }
    private String subid;
    private String subject;
    private String question;
    private String ans1;
    private String ans2;
    private String ans3;
    private String ans4;
    private String correctsns;
    
}
