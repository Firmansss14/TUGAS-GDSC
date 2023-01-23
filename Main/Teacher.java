package Inheritance;

public class Teacher extends School {
    String type = "Teacher";
    Teacher(String nameInput, int ageInput, String typeInput, double spiritInput, double boostopowah, int absenceInput, boolean approveValidation){
        super(nameInput, ageInput, typeInput, spiritInput, boostopowah,absenceInput, approveValidation);
    }

    @Override
    void show(){
        super.show();
        System.out.println("Type: " + this.type);
    }
    @Override
    void receiveboostup(double booster){
        System.out.println(this.name + " boost " + booster);
        this.spirit = this.spirit + booster;
    }
}
