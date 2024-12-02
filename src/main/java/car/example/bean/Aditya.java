package car.example.bean;

public class Aditya {

    private String message;

    public void showMessage() {
        System.out.println(message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
