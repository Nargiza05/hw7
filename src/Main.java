public class Main {
    public static void main(String[] args) {
        // Создание массива из разных героев
        Hero[] heroes = {new Magic(), new Medic(), new Warrior()};

        // Применение суперспособности каждого героя через цикл
        for (Hero hero : heroes) {
            hero.applySuperAbility();
        }

        // Пример приведения типов и вызов метода increaseExperience() для Medic
        if (heroes[1] instanceof Medic) {
            ((Medic) heroes[1]).increaseExperience();
            System.out.println("Опыт лечения увеличен до " + ((Medic) heroes[1]).healPoints);
        }
    }
}