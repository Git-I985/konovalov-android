package com.example.sportapp;

public class Sport {
    private String name;
    private String description;
    private int imageResourseId;

    private Sport(String name, String description, int imageResourseId){
        this.name = name;
        this.description = description;
        this.imageResourseId = imageResourseId;
    }

    public  static  final Sport[] sports = {
            new Sport("Футбол", "Спортивная игра двух команд, состоящая в том, что игроки стараются ударами ноги загнать мяч в ворота противника.", R.drawable.football),
            new Sport("Хоккей", "Командная игра на люду на коньках в небольшой мяч или шайбу", R.drawable.hockey),
            new Sport("Волейбол", "Спортивная игра в мяч, перебрасываемсый руками через сетку от одной команды к другой", R.drawable.volleyball),
            new Sport("Регби", "Спортивная командная игра с овальным мячом, которым игроки передают друг другу, стараясь пересечь линию ворот противника", R.drawable.rugby),
            new Sport("Танцы", "Ритмичные, выразительные телодвижения, обычно выстраеваемые в определенную композицию", R.drawable.dancing),
            new Sport("Баскетбол", "Игра в которой мяч забрасывают руками в подвешенную сетку противной партии", R.drawable.basketball),
            new Sport("Теннис", "Спортиваня игра маленьким мячем, который перебрасывается ракеткой через сетку, разделяющая площадку", R.drawable.tennis),
            new Sport("Плавание", "Вид спорта или спортивная дисциплина, заключающаяся в преодолении вплавь за наименьшее время различных дистанций", R.drawable.swimming),
            new Sport("Каратэ", "Спортивная японская борьба, система самозащиты без оружия", R.drawable.karate),
            new Sport("Бокс", "Кулачный бой в специальных перчатках по определеннымправилам", R.drawable.boxing)
    };

    public  String getName() {
        return name;
    }

    public  String getDescription() {
        return description;
    }

    public  int getImageResourseId() {
        return imageResourseId;
    }

    @Override
    public  String toString() {
        return  this.name;
    }
}
