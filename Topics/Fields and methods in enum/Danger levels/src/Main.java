enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);
    int t;
    DangerLevel(int t)
    {
        this.t = t;
    }
    int getLevel()
    {
        return t;
    }
}