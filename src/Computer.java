public class Computer {
    private String model;
    private String processor;
    private String memory;

    public Computer (String model, String processor, String memory) {
        this.model = model;
        this.processor = processor;
        this.memory = memory;
    }

    public Computer() {
    }

    public String getModel() {
        return model;
    }

    public void setModel (String model) {
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }
}
