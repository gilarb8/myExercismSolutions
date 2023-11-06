-- MIT License
-- Copyright (c) 2023 Gillar Prasatya


-- Create a table named Hamming to encapsulate the Hamming module.
local Hamming = {}

-- Define a function named compute that calculates the Hamming Distance between two DNA strands.
function Hamming.compute(a, b)
  -- Initialize the error count to 0.
  local errorCount = 0

  -- Check the lengths of both input strings 'a' and 'b' if it's not equal.
  if #a ~= #b then
    return -1 -- Return -1 as required when the input strings have different lengths.
  end

  -- Iterate through each character in both strings.
  for i = 1, #a do
    -- Compare characters at the same position in both strings.
    if a:sub(i, i) ~= b:sub(i, i) then
      errorCount = errorCount + 1 -- Increment the error count if characters are different.
    end
  end

  -- Return the error count as the Hamming Distance.
  return errorCount
end

-- Export the Hamming module for external use.
return Hamming
