package com.codurance.lsp;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VehicleShould {

  @Test
  public void start_engine() {
    Vehicle vehicle = new TestableVehicle();

    vehicle.startEngine();

    assertThat(vehicle.engineIsStarted())
            .isTrue();
  }

  @Test
  public void stop_engine() {
    Vehicle vehicle = new TestableVehicle();

    vehicle.startEngine();
    vehicle.stopEngine();

    assertThat(vehicle.engineIsStarted())
            .isFalse();
  }

  private class TestableVehicle extends Vehicle {
    // This class is just for testing purposes
  }
}
