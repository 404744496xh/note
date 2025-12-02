
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Question {
    private String questionText;
    private String type;

    public Question(String questionText, String type) {
        this.questionText = questionText;
        this.type = type;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getType() {
        return type;
    }
}

public class Survey {
    private List<Question> questions;
    private List<String> responses;

    public Survey() {
        questions = new ArrayList<>();
        responses = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void collectData() {
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            if ("是非题".equals(question.getType())) {
                System.out.println("请输入 '是' 或 '否':");
                String response = scanner.nextLine();
                while (!response.equals("是") && !response.equals("否")) {
                    System.out.println("输入无效，请输入 '是' 或 '否':");
                    response = scanner.nextLine();
                }
                responses.add(response);
            } else if ("选择题".equals(question.getType())) {
                System.out.println("请输入选项编号:");
                String response = scanner.nextLine();
                while (!response.matches("\\d")) { // 验证是否为数字
                    System.out.println("输入无效，请输入选项编号:");
                    response = scanner.nextLine();
                }
                responses.add(response);
            } else if ("开放性问题".equals(question.getType())) {
                System.out.println("请输入您的回答:");
                responses.add(scanner.nextLine());
            }
        }
        scanner.close();
    }


    public void analyzeResults() {
        System.out.println("问卷分析结果：");
        for (int i = 0; i < questions.size(); i++) {
            System.out.println("问题：" + questions.get(i).getQuestionText() + "，回答：" + responses.get(i));
        }
    }

    public static void main(String[] args) {
        Survey survey = new Survey();
        survey.addQuestion(new Question("你是否喜欢编程？", "是非题"));
        survey.addQuestion(new Question("你最喜欢的编程语言是什么？1. Java 2. Python 3. C++", "选择题"));
        survey.addQuestion(new Question("你对Java的看法是什么？", "开放性问题"));
        try {
            survey.collectData();
        } catch (Exception e) {
            System.out.println("在收集数据时发生错误：" + e.getMessage());
        }
        survey.analyzeResults();
    }
}