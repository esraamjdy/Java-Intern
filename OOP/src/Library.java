import java.util.ArrayList;
import java.util.List;


class Library {
    private List<Resource> resources;

    public Library() {
        resources = new ArrayList<>();
    }

    public void addResource(Resource resource) {
        resources.add(resource);
        System.out.println(resource.getClass()+" "+"added");
        resource.setAvailability(true);
    }

    public void updateResource(int index, Resource resource) {
        if (index>=0 && index<resources.size()) {
            resources.set(index, resource);
        }
    }

    public void deleteResource(int index) {
        if (index >= 0 && index < resources.size()) {
            resources.remove(index);
        }
    }

    public void checkAvailability(Resource r) {
        if(r.isAvailability()) System.out.println(r.getClass()+" "+r.getTitle()+" is available");
        else System.out.println(r.getClass()+" "+r.getTitle()+" is not available");
    }
    public void displayAllResources() {
        for (Resource resource : resources) {
            resource.display();
            System.out.println();
        }
    }
}
