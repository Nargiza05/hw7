class Medic extends Hero {
    int healPoints;

    public Medic() {
        super(80, 10, "HEALING TOUCH");
        this.healPoints = 50;
    }

    // Метод для увеличения опыта лечения на 10%
    public void increaseExperience() {
        this.healPoints += this.healPoints * 0.1;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность HEALING TOUCH");
        increaseExperience();
    }
}