interface Motor{
    void Power();
    void motorOn();
    void motorOff();
}
class VoltageMotor implements Motor {
    public void Power() {
        System.out.println("���������� 380 �����");
    }
    public void motorOn() {
        System.out.println("����� �������");
    }
    public void motorOff() {
        System.out.println("����� ��������");
    }
}
interface Phone{
    void Power();
    void phoneOn();
    void phoneOff();
}
class iPhone implements Phone {
    public void Power() {
        System.out.println("���������� 220 �����");
    }
    public void phoneOn() {
        System.out.println("������� �������");
    }
    public void phoneOff() {
        System.out.println("������� ��������");
    }
}
class Adapter extends VoltageMotor {
    Phone phone;
    Adapter(Phone phone){
        this.phone = phone;
    }
    public void Power() {
        phone.Power();
    }
    public void motorOn() {
        phone.phoneOn();
    }
    public void motorOff() {
        phone.phoneOff();
    }
}
class PowerUnit {
    public Motor motor;
    PowerUnit(Motor motor){
        this.motor = motor;
    }
    public void work(){
        motor.Power();
        motor.motorOn();
        motor.motorOff();
    }
}
class Main22 {
    public static void main(String[] args) {
        Motor motor = new VoltageMotor();
        PowerUnit powerUnit = new PowerUnit(motor);
        powerUnit.work();
        Phone phone = new iPhone();
        VoltageMotor adapter = new Adapter(phone);
        PowerUnit powerUnit1 = new PowerUnit(adapter);
        powerUnit1.work();
    }
}