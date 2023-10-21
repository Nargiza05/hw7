class Magic extends Hero {
    public Magic() {
        super(100, 20, "MAGIC POWER");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность MAGIC POWER");
    }
}