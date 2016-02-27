package ru.javawebinar.topjava.util;

import ru.javawebinar.topjava.model.UserMeal;
import ru.javawebinar.topjava.model.UserMealWithExceed;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * GKislin
 * 31.05.2015.
 */
public class UserMealsUtil {
    public static void main(String[] args) {
        List<UserMeal> mealList = Arrays.asList(
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 29,10,0), "Завтрак", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 29,13,0), "Обед   ", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 29,20,0), "Ужин   ", 501),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,10,0), "Завтрак", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,13,0), "Обед   ", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,20,0), "Ужин   ", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,10,0), "Завтрак", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,13,0), "Обед   ", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,20,0), "Ужин   ", 510)
        );
        getFilteredMealsWithExceeded(mealList, LocalTime.of(7, 0), LocalTime.of(12,0), 2000);
    }

    public static List<UserMealWithExceed>  getFilteredMealsWithExceeded(List<UserMeal> mealList, LocalTime startTime, LocalTime endTime, int caloriesPerDay) {
        List<UserMealWithExceed> resulList = new ArrayList<>();
        UserMeal userMeal;
        LocalDateTime localDateTime;
        int dayOfMonth=mealList.get(0).getDateTime().getDayOfMonth();
        boolean exceed;
        int sumOfCaloriesDay = 0;
        int countOfDays=0;
        for (int i = 0; i < mealList.size(); i++) {
            userMeal = mealList.get(i);
            localDateTime = userMeal.getDateTime();
            if (dayOfMonth==localDateTime.getDayOfMonth()){
                sumOfCaloriesDay = sumOfCaloriesDay +userMeal.getCalories();
                countOfDays++;
            }
            if (dayOfMonth != localDateTime.getDayOfMonth() || i == (mealList.size()-1)){
                if (sumOfCaloriesDay >caloriesPerDay){
                    exceed=true;
                } else {
                    exceed=false;
                }
                for (int j = (i-countOfDays); j < i; j++) {
                    if (TimeUtil.isBetween(mealList.get(j).getDateTime().toLocalTime(),startTime,endTime)){
                        resulList.add(new UserMealWithExceed(mealList.get(j).getDateTime(), mealList.get(j).
                                getDescription(), mealList.get(j).getCalories(), exceed));
                    }
                }
                dayOfMonth = mealList.get(i).getDateTime().getDayOfMonth();
                sumOfCaloriesDay = userMeal.getCalories();
                countOfDays = 1;
            }
        }
        return resulList;
    }
}
