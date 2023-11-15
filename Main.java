public class Main {
    public static void main(String[] args) {
        CPU myKomputer = new CPU(15000000, "Lenovo");

        CPU.Processor i7 = myKomputer.new Processor(8, "Intel", "i7");
        CPU.RAM rs32GB = myKomputer.new RAM(32, "Samsung");

        myKomputer.getCPUInfo();
        i7.getProcessorInfo();
        rs32GB.getInfoRAM();

        CPU.Harddisk hd = myKomputer.new Harddisk("SSD", 500);
        hd.getHarddiskInfo();

        CPU.Motherboard mb = myKomputer.new Motherboard("KYO KAIZEN", "Intel Z690");
        mb.getMotherboardInfo();

        CPU.PowerSupply psu = myKomputer.new PowerSupply("VOLTRON", 750);
        psu.getPowerSupplyInfo();

        CPU.VGACard vga = myKomputer.new VGACard("AISURIX RX 580", 12);
        vga.getVGACardInfo();
        }
}