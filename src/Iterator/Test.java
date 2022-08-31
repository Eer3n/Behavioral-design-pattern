package Iterator;

import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        Book book = new Book("C++ Book");
        Fascicle fascicle = new Fascicle("Advance C++ Book");

        /*
        for (var question: book.getQuestions()){
            System.out.println(question.getQuestionNumber());
        }

        for (int i = 0;i<fascicle.getQuestions().length;i++){
            var indexElement =fascicle.getQuestions();
            System.out.println(indexElement[i].getQuestionNumber());
        }
         */

        Iterator bookQuestions = book.getQuestionsIterator();
        Iterator fascicleQuestions = fascicle.getQustionIterator();

        printQuestions(bookQuestions);
        printQuestions(fascicleQuestions);
    }

    public static void printQuestions(Iterator questionIterator){

        while(questionIterator.hasNext()){
            Question question = (Question) questionIterator.next();
            System.out.println(question.getQuestionNumber());
        }

    }
}
