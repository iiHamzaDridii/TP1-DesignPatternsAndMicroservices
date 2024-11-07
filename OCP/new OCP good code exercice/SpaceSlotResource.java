package com.directi.training.ocp.exercise;

public class SpaceSlotResource implements Resource {
    @Override
    public int allocate() {
        int resourceId = findFreeSpaceSlot();
        markSpaceSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markSpaceSlotFree(resourceId);
    }

    private void markSpaceSlotFree(int resourceId) {
        // Implementation for marking a space slot as free
    }

    private void markSpaceSlotBusy(int resourceId) {
        // Implementation for marking a space slot as busy
    }

    private int findFreeSpaceSlot() {
        // Logic to find a free space slot
        return 0;
    }
}
