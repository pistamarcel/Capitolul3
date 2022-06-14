
    class NeedForSpeed {
        // TODO: define the constructor for the 'NeedForSpeed' class
        private int speed;
        private int batteryDrain;
        private int distance=0;
        private int battery=100;
        public NeedForSpeed (int speed, int batteryDrain){
            this.speed=speed;
            this.batteryDrain=batteryDrain;
        }
        public boolean batteryDrained() {
            if(this.battery==0){
                return true;
            }else{return false;}
        }

        public int distanceDriven() {
            return this.distance;
        }

        public void drive() {
            if(this.batteryDrained()==false){
                this.distance+=this.speed;
                this.battery=Math.max(0, this.battery-this.batteryDrain);
            }
        }

        public static NeedForSpeed nitro() {
            return new NeedForSpeed(50, 4);
        }
    }

    class RaceTrack {
        // TODO: define the constructor for the 'RaceTrack' class
        private int distance;
        public  RaceTrack(int distance){
            this.distance=distance;
        }
        public boolean carCanFinish(NeedForSpeed car) {
            while(!car.batteryDrained()){
                car.drive();
                if(car.distanceDriven() >=this.distance){return true;}
            }
            return false;
        }
    }


