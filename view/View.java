package view;

import java.util.Scanner;

public class View {
    public String CreateUser(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Введите данные пользователя в следующем формате(через пробел): Фамилия Имя Отчество День рождения(формат dd.mm.yyyy) " +
                "Номер телефона (10-ти значный) Пол(m - мужской или f-женский): ");
        return inp.nextLine();
    }

    public void Exception(Exception e){
        Exception(e.getMessage());
    }

    public void Exception(String str){
        System.out.println(str);
    }
}
