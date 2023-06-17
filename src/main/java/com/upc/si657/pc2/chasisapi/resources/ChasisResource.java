package com.upc.si657.pc2.chasisapi.resources;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChasisResource {
    int cpus;
    long maximumMemory;
    long totalMemory;
    long freeMemory;
    double elapseTime;
    double totalSpace;
    double freeSpace;
}
