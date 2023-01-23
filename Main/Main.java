package Inheritance;

import javax.swing.table.TableRowSorter;

public class Main {
    public static void main(String[] args) {
        School school1 = new School("Firman",18,"SMA",95,10,235,true);
        Students students1 = new Students("Ucok",8,"SD",80.3,5,220, true);
        Staff staff1 = new Staff("Bu Sarinem",50,"Staff Keuangan",60,1,210,true);
        Teacher teacher1 = new Teacher("Pak Budi",45,"Guru SMP",10,50,100,false);
        Security security1 = new Security("Pak Ibas", 65,"Satpam",100,-5,240,true);

        School[] Schoolers = new School[5];
        Schoolers[0] = school1;
        Schoolers[1] = students1;
        Schoolers[2] = staff1;
        Schoolers[3] = teacher1;
        Schoolers[4] = security1;

        Schoolers[0].show();
        Schoolers[1].show();
        Schoolers[2].show();
        Schoolers[3].show();
        Schoolers[4].show();

        System.out.println("=====KEGIATAN DI HARI INI=====\n");
        Schoolers[4].sayHello();
        Schoolers[4].show();
        Schoolers[4].guard();
        Schoolers[4].doSomething("Ngopi");
        Schoolers[4].sayHello();
        Schoolers[4].show();

        Schoolers[2].sayHello();
        Schoolers[2].show();
        Schoolers[2].work();
        Schoolers[2].doSomething("Rumpi");
        Schoolers[2].sayHello();
        Schoolers[2].show();

        Schoolers[3].sayHello();
        Schoolers[3].show();
        Schoolers[3].boost(Schoolers[1]);
        Schoolers[3].teach();
        Schoolers[3].doSomething("Rumpi");
        Schoolers[3].sayHello();
        Schoolers[3].show();

        Schoolers[1].sayHello();
        Schoolers[1].show();
        Schoolers[1].study();
        Schoolers[1].doSomething("Ngupil");
        Schoolers[1].humilate(Schoolers[0]);
        Schoolers[1].rest();
        Schoolers[1].eat();
        Schoolers[1].sayHello();
        Schoolers[1].show();

        Schoolers[0].sayHello();
        Schoolers[0].show();
        Schoolers[0].doSomething("Tawuran");
        Schoolers[0].boost(Schoolers[1]);
        Schoolers[0].sayHello();
        Schoolers[0].show();

    }
}
