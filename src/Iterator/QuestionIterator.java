package Iterator;

import java.util.Iterator;

public class QuestionIterator implements Iterator {
        private Question[] questions;
        private int order;

    public QuestionIterator(Question[] questions) {
        this.questions = questions;
    }


    @Override
    public boolean hasNext() {
        if(order < questions.length){
            return true;
        } return false;
    }

    @Override
    public Object next() {
        Question question = questions[order];
        order++;
        return question;
    }
}
