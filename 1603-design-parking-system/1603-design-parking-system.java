class ParkingSystem {

    HashMap<Integer, Integer> res = new HashMap<>();
    public ParkingSystem(int big, int medium, int small) {
        res.put(1, big);
        res.put(2, medium);
        res.put(3, small);
    }
    
    public boolean addCar(int carType) {
        if(res.get(carType) > 0){
            res.put(carType, res.get(carType) - 1);
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */