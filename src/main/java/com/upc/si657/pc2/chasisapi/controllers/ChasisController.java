package com.upc.si657.pc2.chasisapi.controllers;

import com.upc.si657.pc2.chasisapi.resources.ChasisResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

@RestController
@RequestMapping("api/v1/chasis")
public class ChasisController {
    @GetMapping
    public ChasisResource getChasis() {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        long start = System.nanoTime();
        Runtime runtime = Runtime.getRuntime();
        int cpus = runtime.availableProcessors();
        long mmax = runtime.maxMemory() / 1024 / 1024;
        long mtotal = runtime.totalMemory() / 1024 / 1024;
        long mfree = runtime.freeMemory() / 1024 / 1024;
        File cDrive = new File("C:");
        double elapseTime = (System.nanoTime() - start) / 1_000_000_000;
        double totalSpace = (double) cDrive.getTotalSpace() / 1073741824;
        double freeSpace = (double) cDrive.getFreeSpace() / 1073741824;
        ChasisResource result = new ChasisResource(cpus, mmax, mtotal, mfree, elapseTime, totalSpace, freeSpace);
        return result;
    }
}
