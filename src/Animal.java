public abstract class Animal {
    private String nickname;
    private int age;
    private String breed;

    public Animal(String nickname, int age, String breed) {
        this.nickname = nickname;
        this.age = age;
        this.breed = breed;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }
}

class Cat extends Animal{
    public Cat(String nickname, int age, String breed) {
        super(nickname, age, breed);
    }
    public void run(){
        System.out.println(this.getNickname()+" побежал");
    }
}

class Bird extends Animal{
    public Bird(String nickname, int age, String breed) {
        super(nickname, age, breed);
    }
    public void fly(){
        System.out.println(this.getNickname()+" полетел");
    }
}