
public class ResourceAllocator {
    protected ResourceMarker _resourceMarker;

    public int allocate() {
        int resourceId;
        resourceId = findFreeSlot();
        _resourceMarker.markSlotBusy(resourceId);
        return resourceId;
    };

    public void free(int resourceId) {
        _resourceMarker.markSlotFree(resourceId);
    };

    public int findFreeSlot() {
        return 0;
    };
}
