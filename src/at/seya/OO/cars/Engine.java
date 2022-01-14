package at.seya.OO.cars;

    public class Engine {
        public enum engineType {Diesel, Gas}
        private int power;
        private at.seya.OO.car.Engine.engineType engineType; // Kraftstofftyp

        public Engine(int power, at.seya.OO.car.Engine.engineType engineType) {
            this.power = power;
            this.engineType = engineType;
        }

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }

        public at.seya.OO.car.Engine.engineType getEngineType() {
            return engineType;
        }

        public void setEngineType(at.seya.OO.car.Engine.engineType engineType) {
            this.engineType = engineType;
        }
    }


