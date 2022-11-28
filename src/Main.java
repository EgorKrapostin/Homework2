public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }
    public static void task1(){
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var dogDog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dogDog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2(){
        var friend = 19;
        friend = friend + 2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);
        var frog = 3.5;
        frog = frog * 10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        //frog = ((frog * 10)/ 3.5) + 4;


    }

    public static void task3(){
        var weight1 = 78.2;
        var weight2 = 82.7;

        var weigthTotal = weight1 + weight2;
        System.out.println(weigthTotal);
        var weightDiffrence = weight2 - weight1;
        var weightDiffrence2 = weight2 % weight1;
        System.out.println(weightDiffrence);
        System.out.println(weightDiffrence2);

        var hoursTotal = 640;
        var hoursByOneWorker = 8;
        var workersTotal = hoursTotal/hoursByOneWorker;
        System.out.println("Всего работников в компании — " + workersTotal + " человек");

        var workersTotal2 = workersTotal + 94;
        var hoursTotalNew = workersTotal2 * hoursByOneWorker;
        System.out.println("Если в компании работает " + workersTotal2 + " человек, то всего " + hoursTotalNew + " часов работы может быть поделено между сотрудниками");

    }
}
