## Solution Notes:
Solution.java scores 100%

## Challenge Details

You are working as an intern in the Administratum.

Your purpose is to collect, store and update resource on an account for multiple Administratum contracts.

The resource is stored as a key-value pair in which the key is a string representing a company or organisation name and the value is an integer representing Administratum resource.

You must create a method which takes the integer value and the string key for each organisation and stores them in an array in the format of \"key:value\".

For example:

[ MegaCorp:100, Aperture:900, OmniConsumer:500 ]

Your method must:

    Take the array of existing values and store in an appropriate structure.
    Take the key and value parameters and either add it as a new entry or, where a value with the same key already exists, sum the new value to the existing.
    For example, adding Aperture:200 should return Aperture:1100.
    Sort the results by value in descending order.
    Return the results in the same format as originally provided, i.e. \\\"key:value\\\".

When provided with an invalid input, an empty array should be returned.

The following rules apply:

    Numeric values which are not an integer should be regarded as invalid rather than rounded.
    Negative values are invalid.
    Keys in the input array will never contain a colon (:) character so you do not need to handle this.
    Empty keys are valid.
    Duplicate keys may exist within the input array and should be handled as a single entry with the values summed.

## Test Cases

