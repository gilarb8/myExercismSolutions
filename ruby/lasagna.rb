# MIT License
# Copyright (c) 2024 Gillar Ajie Prasatya
# See LICENSE file for details.

class Lasagna
  EXPECTED_MINUTES_IN_OVEN = 40
  PREPARATION_TIME_PER_LAYER = 2

  # Calculates the remaining time for the lasagna to be in the oven.
  def remaining_minutes_in_oven(actual_minutes_in_oven)
    EXPECTED_MINUTES_IN_OVEN - actual_minutes_in_oven
  end

  # Calculates the preparation time based on the number of layers added to the lasagna.
  def preparation_time_in_minutes(layers)
    layers * PREPARATION_TIME_PER_LAYER
  end

  # Calculates the total time spent on cooking the lasagna, considering preparation and oven time.
  def total_time_in_minutes(number_of_layers:, actual_minutes_in_oven:)
    preparation_time_in_minutes(number_of_layers) + actual_minutes_in_oven
  end
end
