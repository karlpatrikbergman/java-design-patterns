package se.patrikbergman.java.designpattern.creational.factory.abstrakt3;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class NextGentNodeApi implements NodeApi {
    @Override
    public void addNode(String ipAddress) {
        log.info("Adding node with ipAddres {}", ipAddress);
    }
}
