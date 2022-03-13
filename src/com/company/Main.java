package com.company;
import java.io.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.*;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;





public class Main {

    static int num = 0;
    static float tempX = 0;
    static float tempY = 0;

    public static void main(String[] args) throws IOException {

        //Task 1
/*
        //формат ввода 1
        Scanner input = new Scanner(System.in);
        System.out.print("Input a length array: ");
        int n = input.nextInt();     //длина массива
        int[] arr = new int[n];

        for(int i=0; i <= n; i++)
        {
            for (int j=1; j <= n; j++)
            {
                arr[i] = j;
                i++;
            }
        }

        Scanner input2 = new Scanner(System.in);
        System.out.print("Input a length step: ");
        int step = input2.nextInt();    //длина шага
*/
/*
        //формат ввода 2
        int n = 0;     //длина массива
        int step = 0;  //длина шага

        System.out.print("Input length and step: ");
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String vvod = br.readLine();
        String[] tok = vvod.split(" ");
        for (int i=0; i < 1; i++) { // цикл перебора всех введенных переменных
            n = Integer.parseInt(tok[i]);

            step = Integer.parseInt(tok[i+1]);
        }

        int[] arr = new int[n];
        for(int i=0; i <= n; i++)
        {
            for (int j=1; j <= n; j++)
            {
                arr[i] = j;
                i++;
            }
        }


        //задача
        //1. инициализировать массивы по интервалам, кол-во интервалов будет до тех пор пока у последнего интервала
            // не совпадет число с которого начался массив. (тоесть если массив начался с 1, то интервалы
            // заканчиваются когда 1 будет в конце последнего интервала)
        //2. выдернуть первые элементы в интервалах и сохранить в result коллекцию.
        int[] temp = new int[step];
        List<Integer> result = new ArrayList<>();

        for(int i=0; i < n; i++)
        {
            for (int j=0; j < step; j++)
            {
                if (num == n)
                    num=0;

                temp[j] = arr[num];
                num++;
            }
            num--;

            //сохраняем путь
            result.add(temp[0]);

            //прерываем генерацию интервалов
            if(temp[step-1] == arr[0])
                i = n - 1;
        }

        for(int item : result)
        {
            System.out.print(item);
        }
*/



/*
        //Task 2
        //Небольшой комментарий к задаче в виду того, что я недоконца понял условия попадания на окружность.
        //Написал прогграмму исходя из того, что попасть на окружность можно при условии, если одна координата будет
        //на окружности, а вторая координата будет равна 0 или 1, тк далее круг идет по дуге и все что более 2 и выше
        //будет находиться за пределами круга.

        //центр и радиус окружности
        float x = 1;
        float y = 1;
        float radius = 8;
        List<Float> circleRadiusX = new ArrayList<>();
        List<Float> circleRadiusY = new ArrayList<>();
        tempX = -(x + radius);
        tempY = -(y + radius);

        //координаты точки (не успел сделать ввод из файлов к сожалению)
        float butCoordinateX = 9;
        float butCoordinateY = -1;


        //заполнили диапазон круга по X
        for(float i=tempX; i <= tempX || i >= radius+x ; i++)
        {
            circleRadiusX.add(tempX);
            tempX++;

            if(tempX > (x + radius))
                break;
        }
        //заполнили диапазон круга по Y
        for(float i=tempY; i <= tempY || i >= radius+y ; i++)
        {
            circleRadiusY.add(tempY);
            tempY++;

            if(tempY > (y + radius))
                break;
        }


        //поиск мин и макс для проверки окружности
        boolean resX;
        boolean resY;
        resX = circleRadiusX.contains(butCoordinateX);
        resY = circleRadiusY.contains(butCoordinateY);
        if(resX && resY)
        {
            float xMax = circleRadiusX.get(circleRadiusX.size()-1);
            float xMin = -(circleRadiusX.get(circleRadiusX.size()-1));
            float yMax = circleRadiusY.get(circleRadiusY.size()-1);
            float yMin = -(circleRadiusY.get(circleRadiusY.size()-1));

            if((butCoordinateX == xMax && butCoordinateY == 0) || (butCoordinateX == yMin && butCoordinateY == 0)
            || (butCoordinateX == xMax && butCoordinateY == 1) || (butCoordinateX == yMin && butCoordinateY == 1)
            || (butCoordinateX == xMax && butCoordinateY == -1) || (butCoordinateX == yMin && butCoordinateY == -1))
                System.out.println("0 - Точка лежит на окружности");
            else if((butCoordinateY == yMax && butCoordinateX == 0) || (butCoordinateY == xMin && butCoordinateX == 0)
                 || (butCoordinateY == yMax && butCoordinateX == 1) || (butCoordinateY == xMin && butCoordinateX == 1)
                 || (butCoordinateY == yMax && butCoordinateX == -1) || (butCoordinateY == xMin && butCoordinateX == -1))
                System.out.println("0 - Точка лежит на окружности");
            else if(butCoordinateX == xMax && (butCoordinateY == yMax || butCoordinateY == yMin) ||
                    butCoordinateX == xMin && (butCoordinateY == yMax || butCoordinateY == yMin) ||
                    butCoordinateY == yMax && (butCoordinateX == xMax || butCoordinateX == xMin) ||
                    butCoordinateY == yMin && (butCoordinateX == xMax || butCoordinateX == xMin))
                System.out.println("2 - Точка снаружи!");
            else
                System.out.println("1 - Точка внутри!");
        }


        if(resX == false || resY == false)
        {
            System.out.println("2 - Точка снаружи!");
        }
*/









        //Task 3



        //Task 4
/*
        List<Integer> inputList = new ArrayList<>();
        BufferedReader br = null;
        try {
            //чтение файла
            br = new BufferedReader(new FileReader("input.txt"));
            String line;
            while((line = br.readLine()) != null)
            {
                inputList.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            System.out.println("Error ...");
        } finally {
            try
            {
                br.close();
            } catch(IOException e) {
                System.out.println("Error ...");
            }
        }



        int[] numbs = new int[inputList.size()];    //массив с данными из файла

        // Converting ArrayList to Array using get() method
        for (int i = 0; i < inputList.size(); i++)
            numbs[i] = inputList.get(i);


        int[] counts = new int[numbs.length];   //подсчет шагов
        int[] temp = Arrays.copyOf(numbs, numbs.length);    //копирование основного массива во временный

        //пересчет каждого из случаев
        //а) определение эл. массива под который подтягиваем
        //б) перебираем остальные эл. (по хорошему генерация счетчиков и далее их сверка и вывод наименьшего)
        for(int i=0; i < numbs.length; i++)  //цикл смены эл.
        {
            for (int j=0; j < numbs.length; j++)     //цикл подсчета итераций остальных эл.
            {
                if(temp[i] == temp[j])
                {
                    continue;
                }
                else
                {
                    if(temp[i] > temp[j])
                    {
                        temp[j]++;
                        counts[i]++;
                        j--;
                    }
                    else if(temp[i] < temp[j])
                    {
                        temp[j]--;
                        counts[i]++;
                        j--;
                    }
                }
            }
            temp = Arrays.copyOf(numbs, numbs.length);
        }


        //поиск минимального эл массива
        int min = counts[0];
        for(int x: counts) {
            if(x < min) min = x;
        }
        System.out.println("Minimal steps: " + min);

*/




















    }
}
