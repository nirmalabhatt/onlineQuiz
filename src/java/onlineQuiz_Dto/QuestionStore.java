
package onlineQuiz_Dto;

import java.util.ArrayList;

public class QuestionStore {

    @Override
    public String toString() {
        return "QuestionStore{" + "questionList=" + questionList + '}';
    }
    ArrayList <QuestionDTO> questionList;
    public QuestionStore(){
        questionList=new ArrayList<>();
        }
    public void addQuestion(QuestionDTO q){
        questionList.add(q);
    }
     public ArrayList<QuestionDTO> getAlluestions(){
        return questionList;
     }
     public int getCount(){
        return questionList.size();
    }
     public void removeQuestion(int pos){
        questionList.remove(pos);
    }
    public void setQuestionAt(int pos,QuestionDTO q){
        questionList.add(pos,q);
        
    }
     public QuestionDTO getQuestion(int pos){
        return questionList.get(pos);
    }
}
