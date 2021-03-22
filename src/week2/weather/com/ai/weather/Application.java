package week2.weather.com.ai.weather;

import com.imooc.weather.DayWeather;
import com.imooc.weather.HourWeather;
import com.imooc.weather.WeatherUtils;
import com.imooc.weather.impl.WeatherUtilsImpl;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("查询最近天气预报： ");
        System.out.println("输入1：查询未来24小时天气预报");
        System.out.println("输入2：查询未来3天天气预报");
        System.out.println("输入3：查询未来7天天气预报");
        System.out.print("请输入您的选择: ");

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println("用户输入数字： " + i);

        if (i == 1) {
            System.out.print("请输入城市名称查询未来24小时天气预报： ");
            String city = scanner.next();

            WeatherUtils weatherUtils = new WeatherUtilsImpl();
            List<HourWeather> weatherList = weatherUtils.w24h("d8e42e49adfd4786806976996b86e66f", city);
            for (HourWeather hourWeather : weatherList) {
//                System.out.println(hourWeather);
                String year = hourWeather.getYear();
                String month = hourWeather.getMonth();
                String day = hourWeather.getDay();
                String hour = hourWeather.getHour();
                String temperature = hourWeather.getTemperature();
                String windDirection = hourWeather.getWindDirection();
                String windPower = hourWeather.getWindPower();

//                %3s表示不满三个字符，就用空格占满，从左侧开始
//                %-3s表示不满三个字符，就用空格占满，从右侧开始
                String template = "%s年%s月%s日%s时｜%s摄氏度｜%s|%s";
                String row = String.format(template, new String[]{year, month, day, hour, temperature, windDirection, windPower});
                System.out.println(row);
            }
        } else if (i == 2) {
            System.out.print("请输入城市名称查询未来3天天气预报： ");
            Scanner scanner1 = new Scanner(System.in);
            String city = scanner1.next();

            WeatherUtils weatherUtils = new WeatherUtilsImpl();
            List<DayWeather> weatherList = weatherUtils.w3d("d8e42e49adfd4786806976996b86e66f", city);
            for (DayWeather dayWeather : weatherList) {
                String day = dayWeather.getDay();
                String dayAirTemperature = dayWeather.getDayAirTemperature();
                String dayWindPower = dayWeather.getDayWindPower();
                String nightAirTemperature = dayWeather.getNightAirTemperature();
                String nightWindPower = dayWeather.getNightWindPower();

                String template = "%s日｜%s度｜%-10s|%-10s|%-10s";
                String row = String.format(template, new String[]{day, dayAirTemperature, dayWindPower, nightAirTemperature, nightWindPower});
                System.out.println(row);
            }

        } else if (i == 3) {
            System.out.print("请输入城市名称查询未来7天天气预报： ");
            Scanner scanner2 = new Scanner(System.in);
            String city = scanner2.next();

            WeatherUtils weatherUtils = new WeatherUtilsImpl();
            List<DayWeather> dayWeatherList = weatherUtils.w7d("d8e42e49adfd4786806976996b86e66f", city);
            for (DayWeather dayWeather : dayWeatherList) {
                String day = dayWeather.getDay();
                String dayAirTemperature = dayWeather.getDayAirTemperature();
                String dayWindPower = dayWeather.getDayWindPower();
                String nightAirTemperature = dayWeather.getNightAirTemperature();
                String nightWindPower = dayWeather.getNightWindPower();

                String template = "%s日｜%s度｜%-10s|%-10s|%-10s";
                String row = String.format(template, new String[]{day, dayAirTemperature, dayWindPower, nightAirTemperature, nightWindPower});
                System.out.println(row);
            }
        } else {
            System.out.println("您输入的参数有误。");
        }
    }
}
