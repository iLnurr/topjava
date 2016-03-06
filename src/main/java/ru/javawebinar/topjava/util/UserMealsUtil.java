package ru.javawebinar.topjava.util;

import ru.javawebinar.topjava.model.UserMeal;
import ru.javawebinar.topjava.model.UserMealWithExceed;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * GKislin
 * 31.05.2015.
 */
public class UserMealsUtil {
    public static void main(String[] args) {
        List<UserMeal> mealList = Arrays.asList(
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,10,0), "Завтрак", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,13,0), "Обед   ", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,20,0), "Ужин   ", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,10,0), "Завтрак", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,13,0), "Обед   ", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,20,0), "Ужин   ", 510)
        );
        List<UserMealWithExceed> filteredMealsWithExceeded = getFilteredMealsWithExceeded(mealList, LocalTime.of(7, 0), LocalTime.of(12,0), 2000);
        filteredMealsWithExceeded.forEach(System.out::println);
    }

/*
    public static List<UserMealWithExceed> getFilteredMealsWithExceeded(List<UserMeal> mealList, LocalTime startTime, LocalTime endTime, int caloriesPerDay) {
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
                exceed = sumOfCaloriesDay > caloriesPerDay;
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
*/
    public static List<UserMealWithExceed> getFilteredMealsWithExceeded (List<UserMeal> mealList, LocalTime startTime, LocalTime endTime,
                                                    int caloriesPerDay){
        Map<LocalDate, Integer> caloriesSumByDate = mealList.stream()
                .collect(Collectors.groupingBy(userMeal -> userMeal.getDateTime().toLocalDate(),
                Collectors.summingInt(UserMeal::getCalories)));
        return mealList.stream()
                .filter(um -> TimeUtil.isBetween(um.getDateTime().toLocalTime(), startTime, endTime))
                .map(um->new UserMealWithExceed(um.getDateTime(), um.getDescription(),um.getCalories(),
                        caloriesSumByDate.get(um.getDateTime().toLocalDate())>caloriesPerDay))
                .collect(Collectors.toList());
    }
}

