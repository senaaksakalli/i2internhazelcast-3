package com.example;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;


public class HazelcastMapExample {
    public static void main(String[] args) {
        HazelcastInstance client = HazelcastClient.newHazelcastClient();
        IMap<Integer, String> map = client.getMap("sampleMap");
        
        // Put 10,000 entries
        for (int i = 0; i < 10000; i++) {
            map.put(i, "Person_" + i);
        }

        // Retrieve entries to verify
        for (int i = 0; i < 10000; i++) {
            System.out.println("Retrieved: " + map.get(i));
        }

        client.shutdown();
    }

    
    
}
