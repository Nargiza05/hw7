// Абстрактный класс героя
abstract class Hero implements HavingSuperAbility {
    int health;
    int damage;
    String superAbility;

    // Конструктор
    public Hero(int health, int damage, String superAbility) {
        this.health = health;
        this.damage = damage;
        this.superAbility = superAbility;
    }
}
