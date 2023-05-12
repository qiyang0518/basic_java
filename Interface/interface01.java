package com.Interface;
public class interface01
{
    public static void main(String[] args)
    {
        Phone phone = new Phone();
        Computer computer = new Computer();
        computer.Usb(phone);
    }
}
interface UsbInterface
{
    public void start();
    public void end();
}
class Phone implements UsbInterface
{
    public void start()
    {
        System.out.println("Phone,Working~");
    }
    public void end()
    {
        System.out.println("Phone,Work-end");
    }
}
class Computer
{
    public void Usb(UsbInterface usbInterface)
    {
        usbInterface.start();
        usbInterface.end();
    }

}
