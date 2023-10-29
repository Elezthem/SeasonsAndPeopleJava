public enum Season {
    Summer(30), Winter(-35), Autumn(13), Spring(21);

    private int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
