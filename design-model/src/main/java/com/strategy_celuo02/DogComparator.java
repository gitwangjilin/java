package main.java.com.strategy_celuo02;

/*************************************************************************
 ******
 * - Copyright (c) 2022 shangzhao.com
 * - File Name: DogComparator
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions:
 *
 * - History:
 * Date        Author          Modification
 * 2022/6/16   WangJiLin     Create the current class
 *************************************************************************
 ******/
public class DogComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.food < o2.food) {
            return -1;
        } else if (o1.food > o2.food) {
            return 1;
        } else {
            return 0;
        }
    }
}
