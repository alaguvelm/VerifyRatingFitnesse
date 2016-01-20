public class VerifyRating {
   public String teamName;
   public int played;
   public int won;
   public int drawn;
   public int lost;   
  
  public void setTeamName(String teamName)
  {
    this.teamName = teamName;
  }

    public void setPlayed (int played)
  {
    this.played = played;
  }

    public void setWon(int won)
  {
    this.won = won;
  }

    public void setDrawn(int drawn)
  {
    this.drawn = drawn;
  }

    public void setLost(int lost)
  {
    this.lost = lost;
  }
   
   public long  rating() {
      float value = ((10000f*(won*3+drawn))/(3*played))/100;
      return Math.round(value);
   }
}