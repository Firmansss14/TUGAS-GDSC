package Inheritance;

class School {
    public String name;
    public int age;
    public String type;
    double spirit;
    public double boostopowah;
    private int absence;
    private boolean approve;

    School(String nameInput, int ageInput, String typeInput, double spiritInput, double boostopowah, int absenceInput, boolean approveValidation){
        this.name = nameInput;
        this.age = ageInput;
        this.type = typeInput;
        this.spirit = spiritInput;
        this.boostopowah = boostopowah;
        this.absence = absenceInput;
        this.approve = approveValidation;
    }
    void eat(){
        System.out.println("\n" + this.name + " sedang makan");
        this.spirit = this.spirit + 30;
        if (this.spirit>100){
            this.spirit = 100;
        }
        else if(this.spirit < 0){
            this.spirit = 0;
        }
    }
    void rest(){
        System.out.println("\n" + this.name + " sedang istirahat");
        this.spirit = this.spirit + 100;
        if (this.spirit>100){
            this.spirit = 100;
        }
        else if(this.spirit < 0){
            this.spirit = 0;
        }
    }
    void work(){
        System.out.println("\n" + this.name + " sedang bekerja");
        this.spirit = this.spirit - 20;
        if (this.spirit>100){
            this.spirit = 100;
        }
        else if(this.spirit < 0){
            this.spirit = 0;
        }
    }

    void teach(){
        System.out.println("\n" + this.name + " sedang mengajar");
        this.spirit = this.spirit - 15;
        if (this.spirit>100){
            this.spirit = 100;
        }
        else if(this.spirit < 0){
            this.spirit = 0;
        }
    }

    void guard(){
        System.out.println("\n" + this.name + " sedang menjaga pagar sekolah");
        this.spirit = this.spirit - 30;
        if (this.spirit>100){
            this.spirit = 100;
        }
        else if(this.spirit < 0){
            this.spirit = 0;
        }
    }

    void study(){
        System.out.println("\n" + this.name + " sedang belajar");
        this.spirit = this.spirit - 10;
        if (this.spirit>100){
            this.spirit = 100;
        }
        else if(this.spirit < 0){
            this.spirit = 0;
        }
    }

    void doSomething(String doing){
        System.out.println("\n" + this.name + " sedang " + doing);
        this.spirit = this.spirit - 5;
        if (this.spirit>100){
            this.spirit = 100;
        }
        else if(this.spirit < 0){
            this.spirit = 0;
        }
    }
    void humilate(School friends){
        System.out.println("\n" + this.name + " boost up " + friends.name);
        friends.receivehumilate(this.boostopowah);
        if (this.spirit>100){
            this.spirit = 100;
        }
        else if(this.spirit < 0){
            this.spirit = 0;
        }
    }
    void receivehumilate(double humilates){
        System.out.println(this.name + " humilate " + humilates);
        this.spirit = this.spirit - humilates*3;
        if (this.spirit>100){
            this.spirit = 100;
        }
        else if(this.spirit < 0){
            this.spirit = 0;
        }
    }
    void boost(School friend){
        System.out.println("\n" + this.name + " boost up " + friend.name);
        friend.receiveboostup(this.boostopowah);
        if (this.spirit>100){
            this.spirit = 100;
        }
        else if(this.spirit < 0){
            this.spirit = 0;
        }
    }
    void receiveboostup(double booster){
        System.out.println(this.name + " boost " + booster);
        this.spirit = this.spirit + booster;
        if (this.spirit>100){
            this.spirit = 100;
        } else if(this.spirit < 0){
            this.spirit = 0;}
    }
    void sayHello(){
        System.out.println("\nHello " + this.name + "\nini adalah profile anda di hari ini" + "\n========PROFILE========");
    }
    void show(){
        System.out.println("\nName: " + this.name);
        System.out.println("Age: " + this.age + " tahun");
        System.out.println("Type: " + this.type);
        System.out.println("Spirit: " + this.spirit+"%");
        System.out.println("Spirit Given: " + this.boostopowah+"%");
        System.out.println("Absence: " + this.absence+"/240");
        System.out.println("Approve: " + this.approve);
    }
}
