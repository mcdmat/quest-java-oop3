public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
   
    public int getAltitude() {
        return this.altitude;
    }
  
    public boolean isFlying() {
        return this.flying;
    }

    
//  takes off, must be on ground

    @Override
        public void takeOff() {
            if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf("%s takes off in the sky.%n", this.getName());
            }
        }

// ascend
// @param meters altitude increase
// @return altitude

    @Override
        public int ascend(int meters) {
            if (this.flying) {
            this.altitude = Math.min(this.altitude + meters, 325);
            System.out.printf("%s flies upward, altitude : %d%n", this.getName(), this.altitude);
            }
        return this.altitude;
        }

// descend
// @param meters altitude decrease
// @return altitude

    @Override
    public int descend(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude - meters, 0);
            System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

// land, must reach the ground

    @Override
    public void land() {
        if (this.flying && this.altitude < 2) {
            System.out.printf("%s lands on the ground.%n", this.getName());
        } else {
            System.out.printf("%s It's too high, it can't lands.%n", this.getName());
        }
    }
// must be high in the air
    @Override
    public void glide() {
        if (this.flying && this.altitude >= 20) {
            System.out.printf("%s glides into the air.%n", this.getName());
        }
    }
}