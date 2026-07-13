class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total_gas = 0;
        int total_cost = 0;
        int current_fuel = 0;
        int start_index = 0;

        for(int i = 0;i<gas.length;i++){
            total_gas += gas[i];
        }
        for(int i = 0;i<cost.length;i++){
            total_cost += cost[i];
        }

        if(total_gas < total_cost){
            return -1;
        }
        else{
            for(int i = 0;i<gas.length;i++){
                current_fuel += (gas[i] - cost[i]);
                if(current_fuel < 0){
                    current_fuel = 0;
                    start_index = i + 1;
                }
            }
        }

        return start_index;
    }
}